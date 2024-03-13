package anhpt.webbansach_backend.entity;

import jakarta.persistence.*;
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
}
