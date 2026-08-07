# How the system is built

## Purpose

The responsibility of this platform is to automate employee identity provisioning by validating onboarding requests, applying business rules, provisioning identities, and recording provisioning state.The platform is designed to be scalable, maintainable, and resilient while providing auditing and error handling.

#### The platform is not responsible for:

- Managing HR employee records
- Replacing Microsoft Entra ID
- Managing employee lifecycle outside provisioning

---

## System Context

### This application interacts with:

- HR Information System
- Microsoft Graph
- PostgreSQL

---

## High-Level System Context
<img width="882" height="745" alt="highLevel drawio" src="https://github.com/user-attachments/assets/c02f3b6b-699a-451b-b4ed-f3bd31e9c492" />



---

## Architecture Principles

### Modular Design
- A modular approach was taken to break down its components and design each structure with a sole purpose of solving the problem.

### Single Responsibility

- Minimize over-engineering while analyzing trade-offs within a low-level architecture

---
## Data Ownership

The HR system owns the employee records.

The platform owns logs, provisioning status, request history, and provisioning metadata.

---

## Components

API layer - Expose REST endpoints to external clients.

Business Layer - Apply business rules and coordinate provisioning. 

Provisioning Engine - Communicate with Microsoft Graph.

Persistence Layer - Store provisioning state and audit history. 

Audit logging - Record provisioning events for troubleshooting and compliance.

---







