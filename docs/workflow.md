# Workflow

### Receive Request
- The platform receives a request from the HR System.

### Validate Requests
- The platform validates employee information before any provisioning begins.

### Apply business rules
- Business rules determine how the employee should be provisioned. 

#### Examples include:
- Department
- Job Title
- Role
- Licenses

### Provision Identity
- The platform communicates with Microsoft Graph to create and configure the employee identity.

### Record Provisioning
-Provisioning status and audit information are stored withing PostgreSQL.

### Return Result
The platform returns the provisioning result to the calling system.