package anhpt.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "hinh_thuc_thanh_toan")
public class HinhThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_thanh_toan")
    private int maHinhThucGiaoHang;

    @Column(name = "ten_hinh_thuc_thanh_toan")
    private String tenHinhThucGiaoHang;

    @Column(name = "mo_ta",columnDefinition = "text")
    private String moTa;

    @Column(name = "chi_phi_giao_hang")
    private double chiPhiGiaoHang;

    @Column(name = "chi_phi_thanh_toan")
    private double chiPhiThanhToan;

    @OneToMany(mappedBy = "hinhThucThanhToan",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    List<DonHang> danhsachDonHang;
}
