package com.app.marjane_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "department_administrator")
public class DepartmentAdministrator extends Administrator{
}
