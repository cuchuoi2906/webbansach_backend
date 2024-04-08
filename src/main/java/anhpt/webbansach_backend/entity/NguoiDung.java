package anhpt.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.CookieValue;

import java.util.List;

@Entity
@Data
@Table(name = "nguoi_dung")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ma_nguoi_dung")
    private int maNguoiDung;

    @Column(name = "ho_dem",length = 256)
    private String hoDem;

    @Column(name = "ten",length = 256)
    private String ten;

    @Column(name = "ten_dang_nhap",length = 256)
    private String tenDangNhap;

    @Column(name = "mat_khau",length = 512)
    private String matKhau;

    @Column(name = "gioi_tinh")
    private char gioiTinh;

    @Column(name="email")
    private String email;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "dia_chi_mua_hang")
    private String diaChiMuaHang;

    @Column(name = "dia_chi_giao_hang")
    private String diaChiGiaoHang;

    @OneToMany(mappedBy = "nguoiDung",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<SuDanhGia> danhSachSuDanhGia;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(
            name = "nguoidung_quyen",
            joinColumns = @JoinColumn(name = "ma_nguoi_dung"),
            inverseJoinColumns = @JoinColumn(name = "ma_quyen")
    )
    List<Quyen> danhSachQuyen;

    @OneToMany(mappedBy = "nguoiDung",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    List<DonHang> danhSachDonHang;

    @OneToMany(mappedBy = "nguoiDung",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    List<GioHang> danhSachGioHang;
}
