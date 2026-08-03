
# Design Philosophy

---

## Design goals

The design principles that guided this project were how, why, and trade-offs. This approach was taken to evaluate design that satisfies its purpose with consideration to trade-offs. 

### Decision 
Separate HR from provisioning

### Problem
Employee information already exist in an HR system

### Decision 
The provisioning platform will focus on onboarding requests instead of managing records.

### Why

This establishes a single source of truth for employee data and keeps the platform focused solely on identity provisioning.

### Trade-offs

#### Pros
- Lower coupling
- Simpler architecture
- Easier maintenance

#### Cons
- Requires integration with an external system
---

### Decision
HR owns employeeId and PostgreSQL owns Id

---

### Decision
DTO will handle LocalDateTime formatting.

