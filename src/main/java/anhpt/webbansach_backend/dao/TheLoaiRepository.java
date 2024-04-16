package anhpt.webbansach_backend.dao;

import anhpt.webbansach_backend.entity.DonHang;
import anhpt.webbansach_backend.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheLoaiRepository extends JpaRepository<TheLoai,Integer> {

}
