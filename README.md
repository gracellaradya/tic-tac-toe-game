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
(lihat folder screenshots/)

## Video Link
YouTube: (isi nanti)