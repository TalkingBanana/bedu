package com.care.bedu.community.qna.service.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.bedu.community.qna.dao.QnaDAO;
import com.care.bedu.community.qna.service.QnaService;
import com.care.bedu.community.qna.vo.QnaVO;

@Service
public class QnaServiceImpl implements QnaService{
	
	@Autowired private QnaDAO qnaDAO;

	@Override
	public ArrayList<QnaVO> listProc(QnaVO qnaDTO) {
		qnaDTO.setPage((qnaDTO.getPage()-1)*5);
		if(qnaDTO.getKeyword() != null) {
			return qnaDAO.viewsearch(qnaDTO);
		}
		return qnaDAO.viewlist(qnaDTO);
	}

	@Override
	public int boardwrite(QnaVO qnaDTO) {
		qnaDTO.setUser_id("test2@test.com"); //테스트를 위해 임시로 넣음 회원객체에서 userId가지고 와야함
		qnaDTO.setReg_id(qnaDTO.getUser_id());
		qnaDTO.setQna_cnt(0);			//글등록시 조회수 좋아요 개수 0으로 초기화하여 데이터베이스에 저장
		qnaDTO.setQna_like_yn(0);
		return qnaDAO.viewWrite(qnaDTO);
	}

	@Override
	public QnaVO viewone(int num) {
		qnaDAO.qnaCntUp(num);
		return qnaDAO.viewone(num);
	}

	@Override
	public int viewdelete(int num) {
		return qnaDAO.viewdelete(num);
	}

	@Override
	public int viewupdate(QnaVO qnaDTO) {
		return qnaDAO.viewupdate(qnaDTO);
	}

	@Override
	public int getTotal() {
		return qnaDAO.getTotal();
	}

	@Override
	public int likeUp(int num) {
		return qnaDAO.likeUp(num);
	}

}
