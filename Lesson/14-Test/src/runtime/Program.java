package runtime;

import data.StaffManagement;
import mytoys.InputTools;

public class Program {
    public static void main(String[] args) {
    //    int number = InputTools.getAnInteger("Nhập số nguyên đi", "SAI! NHẬP LẠI!!!");
    //    System.out.println("Number: "+number);//demo cách nhập
        
        StaffManagement sm = new StaffManagement();
        sm.addNewStaff();
        sm.showStaffList();
    }
}




/*
viết chương trình quản lý nhân sự của một công ty
    trong công ty chia ra làm 2 khối chính
    là khối lao động chân tay và khối lao động trí óc
    nhân viên bán hàng(sale-khối văn phòng,trí óc), 
    nhân viên giao hàng, tạp vụ(khối lao động chân tay)
    mô tả:
    đi làm là phải tính lương
    tất cả các nhân sự đều có số chỉ tiêu cần phải đạt trong quá trình làm việc
    khối nhân viên lao động trí óc tính lương theo số lượng sản phẩm
    nhân viên lao động chân tay tính tiền theo số giờ làm việc
    [nhân viên khối văn phòng thì có mang laptop riêng hiệu gì đó
    nhân viên giao hàng thì lại có chiếc xe riêng hiệu gì đó
    tạp vụ thì cũng có công cụ riêng: chổi, máy hút bụi, cây lau nha]
    nhiệm vụ của bạn là viết chương trình menu gồm các tính năng sau
    

    1.thêm mới nhân sự
    2.tìm kiếm nhân sự dựa trên id
    3.in ra danh sách nhân sự theo tự tăng dần theo tên
    4.xóa nhân sự dựa trên id
    5.in ra danh sách các nhân sự đạt chỉ tiêu
    chỉ tiêu: 85 / 100
*/