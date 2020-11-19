/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import helper.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChamCong;

/**
 *
 * @author Cao Do
 */
public class ChamCongDao {

    public List<ChamCong> select() {
        String sql = "SELECT CHAMCONG.*, NHANVIEN.HoTen FROM CHAMCONG\n"
                + "inner join NHANVIEN on CHAMCONG.MaNV = NHANVIEN.MaNV";
        return select(sql);
    }

    public void update(ChamCong model) {
        String sql = "UPDATE CHAMCONG SET D1=?,D2=?,D3=?,D4=?,D5=?,D6=?,D7=?,D8=?,D9=?,D10=?,D11=?,D12=?,D13=?,D14=?,D15=?,D16=?,D17=?,D18=?,D19=?,D20=?"
                + "D21=?,D22=?,D23=?,D24=?,D25=?,D26=?,D27=?,D28=?,D29=?,D30=?,D31=? WHERE MANV = ? AND THANG = ? AND NAM = ?";
        JdbcHelper.executeUpdate(sql,
                model.getD1(),
                model.getD2(),
                model.getD3(),
                model.getD4(),
                model.getD5(),
                model.getD6(),
                model.getD7(),
                model.getD8(),
                model.getD9(),
                model.getD10(),
                model.getD11(),
                model.getD12(),
                model.getD13(),
                model.getD14(),
                model.getD15(),
                model.getD16(),
                model.getD17(),
                model.getD18(),
                model.getD19(),
                model.getD20(),
                model.getD20(),
                model.getD21(),
                model.getD22(),
                model.getD23(),
                model.getD24(),
                model.getD25(),
                model.getD26(),
                model.getD27(),
                model.getD28(),
                model.getD29(),
                model.getD30(),
                model.getD31(),
                model.getMaChamCong(),
                model.getMaNV(),
                model.getThang(),
                model.getNam()
        );
    }

    public List<ChamCong> selectByKeyword(String keyword) {
        String sql = "SELECT CHAMCONG.*, NHANVIEN.HoTen FROM CHAMCONG\n"
                + "inner join NHANVIEN on CHAMCONG.MaNV = NHANVIEN.MaNV\n"
                + "where Thang like '%?%' and Nam = ?";
        return select(sql, "%" + keyword + "%");
    }

    private List<ChamCong> select(String sql, Object... args) {
        List<ChamCong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    ChamCong model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private ChamCong readFromResultSet(ResultSet rs) throws SQLException {
        ChamCong model = new ChamCong();
        model.setMaChamCong(rs.getInt("MaChamCong"));
        model.setMaNV(rs.getString("MaNV"));
        model.setHoten(rs.getString("HoTen"));
        model.setThang(rs.getInt("Thang"));
        model.setNam(rs.getInt("Nam"));
        model.setD1(rs.getInt("D1"));
        model.setD2(rs.getInt("D2"));
        model.setD3(rs.getInt("D3"));
        model.setD4(rs.getInt("D4"));
        model.setD5(rs.getInt("D5"));
        model.setD6(rs.getInt("D6"));
        model.setD7(rs.getInt("D7"));
        model.setD8(rs.getInt("D8"));
        model.setD9(rs.getInt("D9"));
        model.setD10(rs.getInt("D10"));
        model.setD11(rs.getInt("D11"));
        model.setD12(rs.getInt("D12"));
        model.setD13(rs.getInt("D13"));
        model.setD14(rs.getInt("D14"));
        model.setD15(rs.getInt("D15"));
        model.setD16(rs.getInt("D16"));
        model.setD17(rs.getInt("D17"));
        model.setD18(rs.getInt("D18"));
        model.setD19(rs.getInt("D19"));
        model.setD20(rs.getInt("D20"));
        model.setD21(rs.getInt("D21"));
        model.setD22(rs.getInt("D22"));
        model.setD23(rs.getInt("D23"));
        model.setD24(rs.getInt("D24"));
        model.setD25(rs.getInt("D25"));
        model.setD26(rs.getInt("D26"));
        model.setD27(rs.getInt("D27"));
        model.setD28(rs.getInt("D28"));
        model.setD29(rs.getInt("D29"));
        model.setD30(rs.getInt("D30"));
        model.setD31(rs.getInt("D31"));
        return model;
    }
}
