//
//  PlayingPiece.swift
//  TicTacToeLowLevelDesign
//
//  Created by Aman Goel on 26/04/25.
//

import Foundation

enum PieceType {
    case X
    case O
}

class PlayingPiece {
    var pieceType: PieceType
    
    init(inputPiece: PieceType) {
        self.pieceType = inputPiece
    }
}

class X: PlayingPiece {
    init() {
        super.init(inputPiece: PieceType.X)
    }
}

class O: PlayingPiece {
    init() {
        super.init(inputPiece: PieceType.O)
    }
}

class Player {
    var name: String
    var playingPiece: PlayingPiece
    
    init(inputName: String, piece: PlayingPiece) {
        self.name = inputName
        self.playingPiece = piece
    }
    
    func getName() -> String {
        return name
    }
    
    func setName(input: String) {
        self.name = input
    }
    
    func getPlayingPiece() -> PlayingPiece {
        return playingPiece
    }
    
    func setPlayingPiece(inputPiece: PlayingPiece) {
        self.playingPiece = inputPiece
    }
}


class Board {
    var size: Int
    var board: [[PlayingPiece?]]
    
    init(inputSize: Int) {
        self.size = inputSize
        
        board = Array(repeating: Array(repeating: nil, count: inputSize), count: inputSize)
    }
    
    func addPiece(row: Int, col: Int, piece: PlayingPiece) -> Bool {
        if(board[row][col] != nil) {
            return false
        }
        
        board[row][col] = piece
        return true
    }
    
    func printBoard() {
        for row in 0..<size {
            print()
            for col in 0..<size {
                print(board[row][col]?.pieceType ?? "")
            }
        }
    }
    
    func getFreeSpace() -> [(Int, Int)] {
        var ans: [(Int, Int)] = []
        
        for row in 0..<size {
            for col in 0..<size {
                if(board[row][col] == nil) {
                    ans.append((row, col))
                }
            }
        }
        
        return ans
    }
}

public class TicTacToeGame {
    var players: [Player]
    var board: Board
    
    // extra
    var userInput: [(Int, Int)]
    var index: Int
    
    init(players: [Player] = [], board: Board = Board(inputSize: 3), userInput: [(Int, Int)] = []) {
        self.players = players
        self.board = board
        self.userInput = userInput
        index = 0
    }
    
    func initializeGame() {
        // creating two player..
        
        let pieceX = PlayingPiece(inputPiece: .X)
        let pieceO = PlayingPiece(inputPiece: .O)
        
        let firstPlayer = Player(inputName: "aman", piece: pieceX)
        let secondPlayer = Player(inputName: "rahul", piece: pieceO)
        
        
        players.append(firstPlayer)
        players.append(secondPlayer)
        
        board = Board(inputSize: 3)
    }
    
    
    
    func startGame() -> String {
        var noWinner: Bool = true
        
        while(noWinner) {
            var playerTurn: Player = players.removeFirst()
            
            // get free space from the board...
            board.printBoard()
            var freeSpaces: [(Int, Int)] = board.getFreeSpace()
            if(freeSpaces.isEmpty) {
                noWinner = false
                continue
            }
            
            var pieceAdded: Bool = board.addPiece(row: userInput[index].0, col: userInput[index].1, piece: playerTurn.playingPiece)
            if(!pieceAdded) {
                print("Incorrect position given")
                players.insert(playerTurn, at: 0)
                continue
            }
            players.append(playerTurn)
            
            var winner = isThereWinner(row: userInput[index].0, col: userInput[index].1, piece: playerTurn.playingPiece)
            if(winner) {
                return playerTurn.name
            }
        }
        
        return "Tie"
    }
    
    func isThereWinner(row: Int, col: Int, piece: PlayingPiece) -> Bool {
        var rowMatch = true
        var colMatch = true
        var diagonalMatch = true
        var antiDiagonalMatch = true
        
        // checking the row...
        for colIndex in 0..<board.size {
            if let value = board.board[row][colIndex] {
                if(value.pieceType != piece.pieceType) {
                    rowMatch = false;
                    break
                }
            } else {
                rowMatch = false
                break
            }
        }
        
        // checking the col...
        for rowIndex in 0..<board.size {
            if let value = board.board[rowIndex][col] {
                if(value.pieceType != piece.pieceType) {
                    colMatch = false
                    break
                }
            } else {
                colMatch = false
                break
            }
        }
        
        // checking diagonal.. south - east direction
        var indexRow = row + 1
        var indexCol = col + 1
        
        while(indexRow < board.size && indexCol < board.size) {
            if let value = board.board[indexRow][indexCol] {
                if(value.pieceType != piece.pieceType) {
                    diagonalMatch = false
                    break
                }
            } else {
                diagonalMatch = false
                break
            }
            
            indexRow = indexRow + 1
            indexCol = indexCol + 1
        }
        
        indexRow = row - 1
        indexCol = col - 1
        
        while(indexRow >= 0 && indexCol >= 0) {
            if let value = board.board[indexRow][indexCol] {
                if(value.pieceType != piece.pieceType) {
                    diagonalMatch = false
                    break
                }
            } else {
                diagonalMatch = false
                break
            }
            
            indexRow = indexRow - 1
            indexCol = indexCol - 1
        }
        
        
        // checking anti-diagonal values....
        
        indexRow = row - 1
        indexCol = col + 1
        
        while(indexRow >= 0 && indexCol < board.size) {
            if let value = board.board[indexRow][indexCol] {
                if(value.pieceType != piece.pieceType) {
                    antiDiagonalMatch = false
                    break
                }
            } else {
                antiDiagonalMatch = false
                break
            }
            
            indexRow = indexRow - 1
            indexCol = indexCol + 1
        }
        
        indexRow = row + 1
        indexCol = col - 1
        
        while(indexRow < board.size && indexCol >= 0) {
            if let value = board.board[indexRow][indexCol] {
                if(value.pieceType != piece.pieceType) {
                    antiDiagonalMatch = false
                    break
                }
            } else {
                antiDiagonalMatch = false
                break
            }
                        
            indexRow = indexRow + 1
            indexCol = indexCol - 1
        }
        
        return (rowMatch || colMatch || diagonalMatch || antiDiagonalMatch)
    }
}
