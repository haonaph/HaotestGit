/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import helper.JdbcHelper;

/**
 *
 * @author LENOVO
 */
public class NhanVienDAO extends CSDAO<NhanVien, String> {

    
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
      JdbcHelper.executeUpdate(DELETE_SQL, key);
    }

    @Override
    public List<NhanVien> selectAll() {
         return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... agrs) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, agrs);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("Mã NV"));
                entity.setMaPB(rs.getString("Mã PB"));
                entity.setMatKhau(rs.getString("Mật Khẩu"));
                entity.setTenNV(rs.getString("Tên NV"));
                entity.setDiaChi(rs.getString("Địa Chỉ"));
                entity.setSdt(rs.getString("SDT"));
                entity.setNgaySinh(rs.getDate("Ngày Sinh"));
                entity.setNoiSinh(rs.getString("Nơi Sinh"));
                entity.setCMND(rs.getString("CMND"));
                entity.setGioiTinh(rs.getBoolean("Giới Tính"));
                entity.setEmail(rs.getString("Email"));
                entity.setTinhTrangHonNhan(rs.getBoolean("Tình Trạng Hôn Nhân"));
                entity.setTrangThaiLamViec(rs.getBoolean("Trạng Thái Làm Việc"));
                entity.setSdt1(rs.getString("SDT Khác"));
                entity.setAnh(rs.getString("Ảnh"));
                entity.setGhiChu(rs.getString("Ghi Chú"));
                entity.setChucVu(rs.getBoolean("Chức Vụ"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
