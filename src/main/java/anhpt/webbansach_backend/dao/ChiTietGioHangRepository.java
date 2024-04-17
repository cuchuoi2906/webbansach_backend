package anhpt.webbansach_backend.dao;

import anhpt.webbansach_backend.entity.ChiTietGioHang;
import anhpt.webbansach_backend.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "chi-tiet-gio-hang")
public interface ChiTietGioHangRepository extends JpaRepository<ChiTietGioHang,Integer> {

}
