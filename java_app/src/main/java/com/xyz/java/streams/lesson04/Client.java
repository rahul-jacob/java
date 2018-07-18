package com.xyz.java.streams.lesson04;

public class Client {

	public static void main(String[] args) {

		/*
		 * BigDecimal invoiceAmount =
		 * assetDetails.stream().map(TblInvoiceDetail::getInvoiceAmount)
		 * .reduce(BigDecimal.ZERO, BigDecimal::add);
		 */
		/*
		 * java.util.function.Predicate<TblInvoiceDetail> predicate = element ->
		 * element .getAssetStatus().equals("ACT"); long count =
		 * assetDetails.stream().filter(predicate).count();
		 * 
		 * BigDecimal invoiceAmount = BigDecimal.ZERO; BigDecimal creditAmount =
		 * BigDecimal.ZERO; if (count > 0) { if
		 * ("INVOICE".equals(invoice.getInvoiceType().toUpperCase()))
		 * invoiceAmount = invoice.getInvoiceTotal().divide(new
		 * BigDecimal(count), MathContext.DECIMAL128); else if
		 * ("CREDIT".equals(invoice.getInvoiceType().toUpperCase()))
		 * creditAmount = invoice.getInvoiceTotal().divide(new
		 * BigDecimal(count), MathContext.DECIMAL128); }
		 */
		
	}

}
