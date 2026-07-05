# Enterprise Identity Provisioning & Cloud Automation Platform

## Overview

The Enterprise Identity Provisioning Platform is a Spring Boot application designed to automate employee identity provisioning within Microsoft Entra ID using the Microsoft Graph API.

The long-term goal of this project is to simulate and implement an enterprise onboarding workflow where new employees can be provisioned with user accounts, group memberships, Microsoft 365 licenses, and audit logs through a centralized backend application.

This project is being developed incrementally using versioned releases to demonstrate the design, implementation, and evolution of an enterprise-grade backend system.

---

## Project Objectives

* Build a production-inspired Spring Boot backend application.
* Practice designing scalable backend architecture.
* Learn Microsoft Graph API integration.
* Automate employee identity provisioning workflows.
* Develop hands-on experience with Azure services and cloud authentication.
* Document architectural decisions and project evolution throughout development.

---

## Technologies

Current technologies:

* Java 17
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
* Health check endpoint
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
├── screenshots/
├── docs/
├── README.md
├── CHANGELOG.md
├── LICENSE
└── .gitignore
```

---

## Getting Started

### Prerequisites

* Java 17
* Maven
* PostgreSQL
* Git

### Running the Application

1. Clone the repository.
2. Configure the PostgreSQL database.
3. Update the application configuration.
4. Run the Spring Boot application.
5. Verify the application starts successfully.
6. Test the health check endpoint.

---
