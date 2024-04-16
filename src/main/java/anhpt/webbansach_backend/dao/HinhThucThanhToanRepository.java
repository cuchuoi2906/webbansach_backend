package anhpt.webbansach_backend.dao;

import anhpt.webbansach_backend.entity.DonHang;
import anhpt.webbansach_backend.entity.HinhThucThanhToan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HinhThucThanhToanRepository extends JpaRepository<HinhThucThanhToan,Integer> {

}
