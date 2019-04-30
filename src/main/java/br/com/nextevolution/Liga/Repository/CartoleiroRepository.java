package br.com.nextevolution.Liga.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nextevolution.Liga.model.Cartoleiro;
@Repository
public interface CartoleiroRepository extends JpaRepository<Cartoleiro, Integer> {

}
