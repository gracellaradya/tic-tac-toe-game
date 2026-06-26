# Simple Tic-Tac-Toe Game with Java Swing, Login, and Statistics

## Student Information
Name: Gracella Radyasari
Student ID: 5026251015
Class: E

## Project Description
Game Tic-Tac-Toe sederhana menggunakan Java Swing. Mencakup fitur login,
statistik permainan, dan Top 5 scorer.

## Features
- Login menggunakan database PostgreSQL
- Bermain Tic-Tac-Toe melawan komputer
- Mencatat wins, losses, draws, dan score
- Menampilkan statistik pribadi
- Menampilkan Top 5 scorer menggunakan JTable

## Database
Database: PostgreSQL
Schema ada di file `database/schema.sql`

## How to Run
1. Buat database PostgreSQL bernama `game_project`
2. Jalankan `database/schema.sql` untuk membuat tabel dan data dummy
3. Buka project di IntelliJ
4. Tambahkan driver PostgreSQL JDBC ke library project
5. Sesuaikan URL, USER, PASSWORD di `DatabaseManager.java`
6. Run `Main.java`

## Class Explanation
- Main: titik masuk program
- DatabaseManager: koneksi ke database
- Player: model data pemain
- PlayerService: operasi database (login, update statistik, top 5)
- GameLogic: aturan permainan Tic-Tac-Toe
- LoginFrame, MainMenuFrame, GameFrame, StatisticsFrame, TopScorersFrame: GUI

## Screenshots
<img width="450" height="233" alt="top-scorers-window" src="https://github.com/user-attachments/assets/f7b5ec74-ecf4-4288-b0c5-0383f6c066d6" />
<img width="343" height="217" alt="login-window" src="https://github.com/user-attachments/assets/6989fb8c-dbe8-4fc3-a7a5-7a475436d0b0" />
<img width="395" height="469" alt="game-window" src="https://github.com/user-attachments/assets/f2e15ebf-6327-4f40-8910-55bf59991c4f" />

## Video Link
YouTube: https://youtu.be/OyzlCuyhn2E
