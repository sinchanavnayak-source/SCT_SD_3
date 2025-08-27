# 🧩 Sudoku Solver (Java)

This project is a **backtracking-based Sudoku solver** written in **Java**.  
It takes a partially filled Sudoku grid as input and outputs the solved grid (if a solution exists).

---

## 📌 Features
- Solves any valid **9x9 Sudoku puzzle**.
- Uses **backtracking algorithm** for efficiency.
- Prints the puzzle in a **readable grid format** with separators for 3x3 subgrids.
- Shows both the **original puzzle** and the **solved puzzle**.

---

## 🚀 How It Works
The solver follows these steps:
1. Find the first empty cell in the Sudoku grid.
2. Try numbers **1 to 9** in that position.
3. Check if the number is valid:
   - Not in the same row.
   - Not in the same column.
   - Not in the same 3x3 subgrid.
4. If valid, place the number and **recursively solve** the rest of the board.
5. If no number fits, backtrack and try a different number.

---

## 📂 Project Structure
