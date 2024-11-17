package com.bisVivek.libraryManagementSystem.Repository;

import com.bisVivek.libraryManagementSystem.Entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepository extends JpaRepository<Loan, Long> {
}
