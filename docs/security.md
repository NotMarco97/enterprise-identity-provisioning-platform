# Security

---

## Purpose

This document describes how the platform authenticates, authorizes, stores sensitive information, and communicates with external services.

---

### Authentication

- The platform authenticates with Microsoft Entra ID using OAuth 2.0 Client Credentials.
- Microsoft Graph application permissions are limited to those required for identity provisioning.

### Secret Management
- Local development configuration.

### Secure Communication
- HTTPS
- OAuth access tokens
- Microsoft Graph Rest API
- PostgreSQL authenticated connections

### Security Boundaries 

- HR system owns employee data
- Microsoft Graph exposes identity management API
- Platform orchestrates provisioning