package anhpt.webbansach_backend.entity;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach")
    private int maSach;

    @Column(name = "ten_sach",length = 256)
    private String tenSach;

    @Column(name = "ten_tac_gia",length = 256)
    private String tenTacGia;

    @Column(name = "isbn")
    private String ISBN;

    @Column(name = "mo_ta",columnDefinition = "text")
    private String moTa;

    @Column(name = "gia_niem_yet")
    private double giaNiemYet;

    @Column(name = "gia_ban")
    private double giaBan;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "trung_binh_xep_hang")
    private Double trungBinhXepHang;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(
            name = "sach_theloai",
            joinColumns = @JoinColumn(name="ma_sach"),
            inverseJoinColumns = @JoinColumn(name="ma_the_loai")
    )
    List<TheLoai> danhSachTheLoai;

    @OneToMany(mappedBy ="sach",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<SuDanhGia> danhSachSuDanhGia;
    @OneToMany(mappedBy = "sach",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<HinhAnh> danhSachHinhAnh;

    @OneToMany(mappedBy ="sach",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<ChiTietDonHang> danhSachChiTietDonHang;

    @OneToMany(mappedBy = "sach",fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    List<ChiTietGioHang> danhSachChiTietGioHang;
}
