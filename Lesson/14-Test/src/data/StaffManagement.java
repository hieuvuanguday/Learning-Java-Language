package data;
//factory pattern: tra cách làm trên này

import java.util.ArrayList;
import mytoys.InputTools;

public class StaffManagement {
    ArrayList<Staff> staffList = new ArrayList<>();
    //k cần biến size
    //addNewStaff
    
    public void addNewStaff(){
        String inputId = InputTools.getString("Nhập id mới cho staff:", "Id không đúng chuẩn!!!",
                "(SL|CL|SP)\\d{3}");
        PickRole pr = new PickRole(inputId);
        Staff newStaff = pr.inputInfor();
        staffList.add(newStaff);
    }
    public void showStaffList(){
        if(staffList.isEmpty()){
            System.out.println("Danh sách rỗng: ");
            return;
        }
        System.out.println("Danh sách các Nhân sự: ");
        for (Staff staff : staffList) {
            staff.showInfor();
        }
    }
}

class PickRole{//chọn vai trò
    public String id;

    public PickRole(String id) {
        this.id = id;
    }
    //<E> cái này generics tra generics in java 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Staff inputInfor(){
        //thông tin chung
        String name = InputTools.getString("Vui lòng nhập tên: ", "Tên không được bỏ trống!!!");
        int yob = InputTools.getAnInteger("Nhập năm sinh: ", "Năm sinh không hợp lệ!!!");
        String gender = InputTools.getString("Vui lòng nhập giới tính: ", "Giới tính không được bỏ trống!!!");
        int salaryBase = InputTools.getAnInteger("Nhập lương cứng: ", "Lương cứng không hợp lệ!!!");
        //check Sale
        if(this.getId().matches("[SL]\\d{3}")){//lên regex101 check
            int productPerMonth = InputTools.getAnInteger("Nhập sản phẩm đã bán: ", "Số lượng không hợp lệ!!!");
            String laptopBrand = InputTools.getString("Vui lòng nhập hiệu laptop: ", "Hiệu laptop không được bỏ trống!!!");
            //tạo mới Sale
            Sale newSaler = new Sale(id, name, yob, gender,
                            salaryBase, productPerMonth, laptopBrand);
            return newSaler;
        }else if(this.getId().matches("[CL]d{3}")){//check cleaner
            int overTime = InputTools.getAnInteger("Nhập số giờ làm thêm: ", "Số giờ không hợp lệ!!!");
            String tool = InputTools.getString("Vui lòng nhập công cụ: ", "Công cụ không được bỏ trống!!!");
            //tạo mới Cleaner
            Cleaner newCleaner = new Cleaner(id, name, yob, gender,
                            salaryBase, overTime, tool);
            return newCleaner;
        }else if(this.getId().matches("[SP]\\d{3}")){//check shipper
            int overTime = InputTools.getAnInteger("Nhập số giờ làm thêm: ", "Số giờ không hợp lệ!!!");
            String modelMotor = InputTools.getString("Vui lòng nhập kiểu motor: ", "Kiểu motor không được bỏ trống!!!");
            //tạo mới Shipper
            Shipper newShipper = new Shipper(id, name, yob, gender,
                            salaryBase, overTime, modelMotor);
            return newShipper;
        }else{
            return null;//object thì return null
        }
    }
}
