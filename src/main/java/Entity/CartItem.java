package Entity;

//購物車添加的商品後台
public class CartItem {
		private Product product; //商品
	
		private int buyNum; //個數
		
		private double subTotal; //小計

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public int getBuyNum() {
			return buyNum;
		}

		public void setBuyNum(int buyNum) {
			this.buyNum = buyNum;
		}

		public double getSubTotal() {
			return subTotal;
		}

		public void setSubTotal(double subTotal) {
			this.subTotal = subTotal;
		}

		
		
}
