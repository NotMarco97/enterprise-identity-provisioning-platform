# Enterprise Identity Provisioning & Cloud Automation Platform

## Overview

The Enterprise Identity Provisioning Platform is a Spring Boot application designed to automate employee identity provisioning within Microsoft Entra ID using the Microsoft Graph API.

The long-term goal of this project is to implement an enterprise onboarding workflow where new employees can be provisioned with user accounts, group memberships, Microsoft 365 licenses, and audit logs through a centralized backend application.

This project is being developed incrementally using versioned releases to demonstrate the design, implementation, and evolution of an enterprise-grade backend system.

---

### High-Level Architecture

![highLevel.drawio.png](../../highLevel.drawio.png)

---

## The problem

As organizations grow, manually provisioning user accounts becomes increasingly time-consuming and error-prone. Creating accounts, assigning group memberships, configuring licenses, and maintaining consistency across every employee can significantly slow onboarding and reduce time available for higher-value IT work.

---

## Solution

This platform is designed to automate the identity provisioning process by receiving onboarding requests, validating employee information, applying business rules, assigning Microsoft 365 resources through Microsoft Graph, and recording provisioning activity for auditing purposes. Automating these repetitive tasks reduces manual effort while improving consistency, scalability, and reliability.

---

## Project Objectives

* Build a production Spring Boot backend application.
* Design scalable backend architecture.
* Learn Microsoft Graph API integration.
* Automate employee identity provisioning workflows.
* Develop hands-on experience with Azure services and cloud authentication.
* Document architectural decisions and project evolution throughout development.

---

## Technologies

Current technologies:

* Java 21
* Spring Boot
* Maven
* PostgreSQL
* Git
* GitHub

Planned technologies:

* Microsoft Graph API
* Microsoft Entra ID
* Azure App Service
* Azure Key Vault

---

## Current Version

**Version:** v0.1

Completed in this version:

* Spring Boot project initialization
* Git repository setup
* GitHub repository creation
* PostgreSQL configuration
* Application startup verification
* Initial project documentation

---

## Roadmap

This project is developed using incremental versioned releases.

Upcoming milestones include:

* Employee CRUD API
* Validation and exception handling
* Provisioning workflow
* Audit logging
* Microsoft Graph integration
* Azure deployment
* Production readiness review

---

## Project Structure

```text
Enterprise-Identity-Provisioning-Platform/

├── src/
├── docs/
├── README.md
├── CHANGELOG.md
└── .gitignore
```

---

## Additional Documentation

Detailed documentation for this project can be found inside the '/docs' directory.

* Architecture
* Decisions
* Security
* Workflow

---

## Getting Started

### Prerequisites

* Java 21
* Maven
* PostgreSQL
* Git

---

### Running the Application

1. Clone the repository.
2. Configure the PostgreSQL database.
3. Update the application configuration.
4. Run the Spring Boot application.
5. Verify the application starts successfully.
6. Test the health check endpoint.

---

