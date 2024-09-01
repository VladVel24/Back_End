package de.ait.shop43.product;


import de.ait.shop43.security.Role;
import de.ait.shop43.security.RoleRepository;
import de.ait.shop43.security.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImp implements RoleService {
    private final RoleRepository repository;

    @Override
    public Role getRoleByTitle(String title) {
        return repository.findByTitle(title);
    }
}
