package anhpt.webbansach_backend.entity;

import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.Data;

@Entity
@Table(name = "hinh_anh")
@Data
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_anh")
    private int maHinhAnh;

    @Column(name = "ten_hinh_anh",length = 256)
    private String tenHinhAnh;

    @Column(name = "la_icon")
    private boolean laIcon;

    @Column(name = "duong_dan")
    private String duongDan;

    @Column(name = "du_lieu_anh")
    private String duLieuAnh;

    @ManyToOne(fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH
    })
    @JoinColumn(name = "ma_sach")
    private Sach sach;
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="hinhanh")
@Data
@NoArgsConstructor
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maHinhAnh;
    private String tenHinhanh;
    private boolean icon;
    private String link;

    public HinhAnh(int maHinhAnh, String tenHinhanh, boolean icon, String link) {
        this.maHinhAnh = maHinhAnh;
        this.tenHinhanh = tenHinhanh;
        this.icon = icon;
        this.link = link;
    }

    public HinhAnh(String tenHinhanh, boolean icon, String link) {
        this.tenHinhanh = tenHinhanh;
        this.icon = icon;
        this.link = link;
    }
>>>>>>> ac42e0636b1739d17c22c9cf6c554ebcc01d1a58
}
