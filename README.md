# BankApp

A simple console-based banking application written in Java that simulates basic bank account operations with user authentication and transaction management.

---

## Table of Contents

- [Overview](#overview)  
- [Features](#features)  
- [Technologies](#technologies)   
- [Usage](#usage)  
- [Security & Limitations](#security--limitations)  
- [Future Improvements](#future-improvements)  
- [Author](#author)

---

## Overview

BankApp allows users to create accounts with username, password, phone number, and initial deposit. Existing users can log in using their credentials and perform common banking tasks like deposits, withdrawals (with PIN verification), balance inquiries, and viewing a mini statement. The app uses simple console input/output for interaction and enforces limited login attempts for security.

---

## Features

- **Account Creation:** Users can register by providing a username, password, phone number, address, and initial deposit.
- **User Authentication:** Secure login system with a maximum of 3 attempts before blocking access.
- **Deposit Funds:** Add money to the account balance.
- **Withdraw Funds:** Withdraw money after verifying the PIN/password; includes balance checks.
- **Check Balance:** View current account balance after PIN verification.
- **Mini Statement:** Placeholder for transaction history (can be expanded).
- **Session Management:** User can log out and return to the main menu.
- **Basic Security:** Limits login and PIN attempts with lockout feature.

---

## Technologies

- Java SE (Standard Edition)
- Utilizes `java.util.Scanner` for input handling
- Command-line interface (CLI) based application

---

## Usage

- Upon running the application, you will be prompted with the main menu:
-Choose 1 for Existing User login
-Choose 2 to Create a New Account
-Account Creation requires username, password, phone number, address, and initial deposit.
-Once logged in, you can perform:
-Deposit: Add money to your account.
-Withdraw: Withdraw money after PIN verification.
-Check Balance: View your current balance after PIN verification.
-Mini Statement: Currently a placeholder; can be enhanced.
-Logout: Return to the main menu.

-Note: After 3 incorrect login or PIN attempts, the program will terminate, simulating a 24-hour block.

---

## Security & Limitations

- User credentials and data are stored **in-memory**; no persistent storage means all data is lost when the program closes.
- Passwords are stored in **plain text** — not recommended for production environments.
- Only a **single user** is supported per session — no multi-user concurrency or database support.
- Mini statement functionality is currently a **placeholder** without transaction logging.
- Basic input validation is implemented; however, some edge cases may not be handled.

---

## Future Improvements

- Implement **persistent storage** (file or database) for account data.
- Add **secure password handling** with hashing.
- Develop a **detailed mini-statement** with full transaction history.
- Support **multi-user accounts** with account switching.
- Create a **GUI interface** for improved usability.
- Enhance **input validation** and error handling.

---

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system
- Basic familiarity with running Java programs from the command line

---

### Installation & Running

1. Clone or download the source code (`BankApp.java`).
2. Open a terminal/command prompt and navigate to the directory containing the file.
3. Compile the Java source code:
   ```bash
   javac BankApp.java

---

## Author

Created by **Harshal Patil**
