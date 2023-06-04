package nguyenxuanviet_1356;
import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column
    private String ma;
    @Column
    private  String ten;
    public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Column
    private  String noi;
    @Column
    private String phai;
    @Column
    private int luong;
   
    @ManyToOne
    private  PhongBan phongban;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNoi() {
		return noi;
	}

	public void setNoi(String noi) {
		this.noi = noi;
	}

	public String getPhai() {
		return phai;
	}

	public void setPhai(String phai) {
		this.phai = phai;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public PhongBan getPhongban() {
		return phongban;
	}

	public void setPhongban(PhongBan phongban) {
		this.phongban = phongban;
	}
}


