package uz.pdp.crudappserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.crudappserver.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
