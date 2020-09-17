# onlineshop: 온라인 쇼핑몰 시스템 설계 및 개발 (상품 등록, 상품 할인 기능 구현)


## 개발 환경    
* Java8
* JUnit5

## 기능 요구사항    
* 상품 등록 기능: 사용자에게 상품 카테고리명, 상품번호, 상품명, 상품가격, 상품정보, 상품 수량의 정보를 받아 Store에 저장한다.    
* 상품 할인 기능: 여러 쿠폰에 대해 사용자에게 유리한 할인가를 선택한다.
    + 고객기준: 할인이 가장 많이 되는 쿠폰을 선택한다.    
    + 사업자기준: 할인이 가장 적게 되는 쿠폰을 선택한다.

## 구조    
* 상품 등록    
    + requestProductManagement
    
  ![1](https://user-images.githubusercontent.com/37493709/93419137-fc764f80-f8e6-11ea-8323-af12e5a1ec55.jpg)

    + createNewProduct

  ![2](https://user-images.githubusercontent.com/37493709/93419419-c2f21400-f8e7-11ea-8f5f-107bd8a6d492.jpg)

    + enterProduct
    
    ![3](https://user-images.githubusercontent.com/37493709/93419421-c4234100-f8e7-11ea-9072-6c54b6f3744a.jpg)
    
    + requestCreate
    
    ![4](https://user-images.githubusercontent.com/37493709/93419422-c4234100-f8e7-11ea-9cf7-6ea269043fa6.jpg)
