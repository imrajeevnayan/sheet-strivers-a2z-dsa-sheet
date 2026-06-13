# DRY Principle in Software Development

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <string> using namespace std; // Without DRY (duplicated logic) bool validate_email_format_1(const string& email) { return email.find("@") != string::npos && email.find(".") != string::npos; } bool validate_email_format_2(const string& email) { return email.find("@") != string::npos && email.find(".") != string::npos; } // With DRY (single reusable function) bool validate_email_format(const string& email) { return email.find("@") != string::npos && email.find(".") != string::npos; } int main() { string email1 = "user@example.com"; string email2 = "invalidemail"; // Without DRY usage cout << "Without DRY validation 1: " << validate_email_format_1(email1) << endl; cout << "Without DRY validation 2: " << validate_email_format_2(email2) << endl; // With DRY usage cout << "With DRY validation: " << validate_email_format(email1) << endl; return 0; }
- Difficulty: Unknown
- Topics: Summer SkillUp Explore, Summer SkillUp, Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/software-engineering/dont-repeat-yourselfdry-in-software-development/
- Synced: 2026-06-13T10:52:46.903Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <string> using namespace std; // Without DRY (duplicated logic) bool validate_email_format_1(const string& email) { return email.find("@") != string::npos && email.find(".") != string::npos; } bool validate_email_format_2(const string& email) { return email.find("@") != string::npos && email.find(".") != string::npos; } // With DRY (single reusable function) bool validate_email_format(const string& email) { return email.find("@") != string::npos && email.find(".") != string::npos; } int main() { string email1 = "user@example.com"; string email2 = "invalidemail"; // Without DRY usage cout << "Without DRY validation 1: " << validate_email_format_1(email1) << endl; cout << "Without DRY validation 2: " << validate_email_format_2(email2) << endl; // With DRY usage cout << "With DRY validation: " << validate_email_format(email1) << endl; return 0; }. The detected topics are Summer SkillUp Explore, Summer SkillUp, Explore. Review the synced source file for the implementation details.
