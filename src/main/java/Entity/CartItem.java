package Entity;

//�ʪ����K�[���ӫ~��x
public class CartItem {
		private Product product; //�ӫ~
	
		private int buyNum; //�Ӽ�
		
		private double subTotal; //�p�p

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
