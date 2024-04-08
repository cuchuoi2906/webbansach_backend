package anhpt.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "su_danh_gia")
public class SuDanhGia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_danh_gia")
    private long maDanhGia;

    @Column(name = "diem_xep_hang")
    private float diemXepHang;

    @Column(name = "nhan_xet")
    private String nhanXet;

    @ManyToOne(fetch = FetchType.EAGER,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    @JoinColumn(name = "ma_sach")
    private Sach sach;

    @ManyToOne(fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    @JoinColumn(name = "ma_nguoi_dung")
    private NguoiDung nguoiDung;
}
