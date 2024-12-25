package id.ac.ui.cs.jarkom.websitec03.repository;

import id.ac.ui.cs.jarkom.websitec03.model.Company;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Company, Integer> {

        Company findById(int id);
        List<Company> findAll();
        void deleteById(int id);

}
