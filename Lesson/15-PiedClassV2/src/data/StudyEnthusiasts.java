package data;
/**
 * StudyEnthusiasts: hội những người đam mê học tập
 * nếu bác thợ săn đam mê học mà không care phò mã
 * tương tự, ngựa và khỉ học không care tới hàng nóng của hunter
 * -- Đã là một member của StudyEnthusiasts  thì dù có súng kề cổ
 * thì vẫn tập trung cao độ cho việc học
 * khong quan tâm sống chết
 * học là trên hết, học như một viên đạn luôn nằm trong đầu của John F
 * 
 * Interface là gì? class đặc biệt
 * class này không có thuộc tính, chỉ quan tâm đến hành động
 * các hành động trong class này đêu là abstract
 * không quan tâm thuộc tính, chỉ quan tâm đến việc học
 * còn học như nào thì tùy từng thành viên quyết định
 * 
 */
public interface StudyEnthusiasts {
    //đây là hội nhóm ai cũng có thể tham gia
    //nên không quan tâm đặc điểm
    //nếu ở đây có viết đặc điểm thì nó sẽ là dùng chung
    //ví dụ: ai học cũng đóng học phí
    int FEE = 500;// thiếu modifer
    //nhưng đây là interface, thuộc tính nào cũng xài chung
    //like: puublic static final int FEE = 500;
    //những gì bỏ vào đây đều thành là xài chung
    //hằng số thì có initalValue => không có constructor
    //thằng nào cũng public => không cần getter|setter
    //hàm nào cũng là abstract, dù không có keyword abstract
    //thì nó vẫn là abstract
    public double studyHard();
    public void showProfile();
    //thực tế thì không nên có 2 hàm trong 1 interface, giải thích bài sau
    //ở phần lamda
}

//thực tế khi tạo class không có constructor thì jvm sẽ tự tạo
//1 constructor rỗng
//ngoài ra trong 1 class có thể tạo nhiều constructor
