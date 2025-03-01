package com.sofas.app.service;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sofas.app.bean.Items_ReviewDto;
import com.sofas.app.bean.Review_ListDto;
import com.sofas.app.dao.ItemsDao;
import com.sofas.app.dao.ReviewDao;

public class ItemPageHandler implements CommonHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ItemsDao itemsDao = new ItemsDao();
		
		int items_idx = Integer.parseInt(request.getParameter("items_idx"));
		Items_ReviewDto items_RDto = itemsDao.getItemInfo(items_idx);
		request.setAttribute("items_infoDto", items_RDto);

		itemsDao = new ItemsDao();
//		Vector<Items_ReviewDto> itemVe = itemsDao.SelectBestItem();
//		request.setAttribute("Items_ReviewDto", itemVe);
		
		ReviewDao reviewDao = new ReviewDao();
		Vector<Review_ListDto> items_review = reviewDao.getReviewInfo(items_idx);
		request.setAttribute("items_Rdto", items_review);
		
		
		return "/itempage.jsp";
	}

}
