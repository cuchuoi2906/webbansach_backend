package anhpt.webbansach_backend.rest;

import anhpt.webbansach_backend.dao.DonHangRepository;
import anhpt.webbansach_backend.entity.DonHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class testController {
    @Autowired
    private DonHangRepository donHangRepository;

    @GetMapping("chi_tiet_don_hang/{id}")
    public void getDonHangByID(@PathVariable int id){
        Optional<DonHang> optionalDonHang = donHangRepository.findById(id);

        if (optionalDonHang.isPresent()) { // Kiểm tra Optional có chứa đối tượng hay không
            DonHang donHang = optionalDonHang.get();
            System.out.print(donHang.toString()); // In ra đối tượng DonHang
        } else {
            System.out.print("Không tìm thấy đơn hàng có ID: " + id);
        }
    }
}
