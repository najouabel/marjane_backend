package com.app.marjane_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@Table(name = "general_administrator")
public class GeneralAdministrator extends Administrator{
}
