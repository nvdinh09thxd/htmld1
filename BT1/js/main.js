var listCatElement = document.querySelector('#list-cat');
var listNewsElement = document.querySelector('#list-news');

var listCat = [
    {
        id: 1,
        name: 'Thời sự'
    },
    {
        id: 2,
        name: 'Góc nhìn'
    },
    {
        id: 3,
        name: 'Thế giới'
    },
    {
        id: 4,
        name: 'Kinh doanh'
    },
]

var htmlsCat = '';

for (const el of listCat) {
    htmlsCat += `
        <li><a href="#" title="${el.name}">${el.name}</a></li>
    `
}

console.log(htmlsCat);
listCatElement.innerHTML = htmlsCat;

var listNews = [
    {
        id: 1,
        title: 'Trung Quốc điều thêm 17 tàu đến khu vực giàn khoan',
        content: `Để bảo vệ giàn khoan, Trung Quốc đã điều thêm 17 tàu các loại so với hôm trước, sẵn
        sàng đâm va vào tàu Việt Nam`,
        image: 'h1.jpg'
    },
    {
        id: 2,
        title: 'Trọng tài - Vết đen của kỳ World Cup sôi động',
        content: `World Cup 2014 chưa đi hết lượt đấu vòng bảng nhưng các trọng tài đẳng cấp FIFA đã có
        tới 4 trận bị chỉ trích dữ dội`,
        image: 'h2.jpg'
    },
    {
        id: 3,
        title: 'Những mỹ nhân Việt duyên dáng ở tuổi tứ tuần',
        content: `Để bảo vệ giàn khoan, Trung Quốc đã điều thêm 17 tàu các loại so với hôm trước, sẵn
        sàng đâm va vào tàu Việt Nam`,
        image: 'h3.jpg'
    },
    {
        id: 4,
        title: 'Chuyển nhượng 17/6: Arsenal mua Balotelli, tráo hàng Man Utd',
        content: `Đội bóng thành London đang đẩy mạnh việc tuyển những vị trí còn yếu trong đội hình
        ở cả 3 tuyến`,
        image: 'h4.jpg'
    },
    {
        id: 5,
        title: 'Chuyên gia Anh tin chắc vị trí MH370 rơi',
        content: `Các chuyên gia thuộc công ty viễn thông Anh Inarat cho rằng họ xác định được vị trí
        chiếc máy bay MH370 đã rơi xuống`,
        image: 'h5.jpg'
    },
]

var htmlsNews = '';

for (const el of listNews) {
    htmlsNews += `
        <li>
            <h4>
                <a href="#" title="${el.title}">${el.title}</a>
            </h4>
            <a href="#" title=""><img src="images/tmp/${el.image}" alt="${el.image}" /></a>
            <p>${el.content}</p>
        </li>
    `
}

// console.log(htmlsNews);
listNewsElement.innerHTML = htmlsNews;