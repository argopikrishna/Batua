# Batua - Expense and Income Tracker

Batua is a desktop application for tracking expenses and incomes, built with Java Swing and backed by a MySQL database. It provides a modern, user-friendly interface to add, view, and manage your financial transactions.

---

## Features

- **Add Transactions:** Record both expenses and incomes with descriptions and amounts.
- **Remove Transactions:** Delete any transaction from the list and database.
- **Dashboard Panels:** Visual summary of total expenses, incomes, and balance.
- **Transaction Table:** View all transactions in a sortable, color-coded table.
- **Custom UI:** Modern look with custom title bar, gradient headers, and styled scrollbars.
- **Database Integration:** All data is persisted in a MySQL database.
- **Input Validation:** Ensures correct data entry for amounts and descriptions.
- **Confirmation Dialogs:** Prevent accidental deletions with confirmation prompts.

---

## Project Structure

Batua/ ExpenseAndIncome_Tracker_With_Database/ src/ expenseandincome_tracker_with_database/ ExpenseAndIncomeTrackerApp.java Transaction.java TransactionDAO.java TransactionValuesCalculation.java DatabaseConnection.java lib/ mysql-connector-j-8.1.0.jar build.xml manifest.mf ... README.md

---

## Getting Started

### Prerequisites

- **Java JDK 8+**
- **MySQL Server**
- **NetBeans IDE** (recommended, but not required)

### Database Setup

1. **Create Database and Table:**
   ```sql
   CREATE DATABASE batua_db;
   USE batua_db;

   CREATE TABLE transaction_table (
     id INT AUTO_INCREMENT PRIMARY KEY,
     transaction_type VARCHAR(20) NOT NULL,
     description VARCHAR(255) NOT NULL,
     amount DOUBLE NOT NULL
   );

Update Database Credentials:
Edit DatabaseConnection.java to set your MySQL username, password, and database name.
Build and Run
Add MySQL Connector JAR:

Ensure mysql-connector-j-8.1.0.jar is in the lib/ directory and added to your project's classpath.
Compile and Run:

Using NetBeans: Open the project and click "Run".
Using command line:
  javac -cp "lib/mysql-connector-j-8.1.0.jar" src/expenseandincome_tracker_with_database/*.java
  java -cp "lib/mysql-connector-j-8.1.0.jar:src" expenseandincome_tracker_with_database.ExpenseAndIncomeTrackerApp

  
## Usage
Add Transaction: Click "Add Transaction", fill in the details, and click "Add".
Remove Transaction: Select a row in the table and click "Remove Transaction".
Dashboard: View your total expenses, incomes, and balance at a glance.


## Code Overview

ExpenseAndIncomeTrackerApp.java: Main application UI and logic.
Transaction.java: Model class for transactions.
TransactionDAO.java: Data access object for database operations.
TransactionValuesCalculation.java: Utility for calculating totals.
DatabaseConnection.java: Handles MySQL connection (update credentials here).
