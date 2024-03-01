# Dự án quản lý công nhân



## Mục đích

Dự án này nhằm xây dựng một hệ thống quản lý thông tin về công nhân trong một doanh nghiệp. Chúng ta có thể thêm, sửa đổi, xóa và tìm kiếm thông tin về công nhân, theo dõi quá trình làm việc thông qua bảng chấm công.

## Cài đặt

### Yêu cầu kĩ thuật
- JDK 17 trở lên
- Cơ sở dữ liệu MySQL

### Cách cài đặt
1. Tạo database
- Import file quan_ly_nhan_su.sql để có các bảng và quan hệ

2. Cấu hình kết nối database
- Mở file src\DAO\database.java
- Chỉnh sửa thông tin kết nối database (Host, User, Password) cho phù hớp với máy

## Cách sử dụng

1. Chạy ứng dụng
- Chạy file src\view\Home.java

2. Thêm 
- Mở Menu và chọn trang tương ứng
- Điền thông tin cần thiết 
- Nhấn nút + để thêm

3. Xóa 
- Mở Menu và chọn trang tương ứng
- Nhấn chọn vào dòng dữ liệu cần xóa
- Nhấn nút xóa 

4. Chỉnh sửa thông tin
- Mở Menu và chọn trang tương ứng
- Điền tất cả thông tin và thông tin cần sửa
- Nhấn nút sửa

5. Tìm kiếm
- Mở Menu và chọn trang tương ứng
- Nhập tên công nhân / xưởng vào thanh tìm kiếm
- Nhấn nút tìm kiếm 

## Tác giả
- Nguyễn Chí Trường, 22010441, K16-KHMT, Trường Đại học Phenikaa
- Nguyễn Quang Bình, 22010162, K16-KHMT, Trường Đại học Phenikaa