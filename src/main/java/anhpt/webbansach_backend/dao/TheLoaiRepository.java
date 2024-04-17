package anhpt.webbansach_backend.dao;

import anhpt.webbansach_backend.entity.DonHang;
import anhpt.webbansach_backend.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "the-loai")
public interface TheLoaiRepository extends JpaRepository<TheLoai,Integer> {

}
