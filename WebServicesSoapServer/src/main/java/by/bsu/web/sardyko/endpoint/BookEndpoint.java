package by.bsu.web.sardyko.endpoint;

import by.bsu.web.sardyko.models.book.GetBookByIdRequest;
import by.bsu.web.sardyko.models.book.GetBookListByAuthorRequest;
import by.bsu.web.sardyko.models.book.GetBookListByPublisherRequest;
import by.bsu.web.sardyko.models.book.GetBookListByYearRequest;
import by.bsu.web.sardyko.models.book.GetBookListResponse;
import by.bsu.web.sardyko.models.book.GetBookResponse;
import by.bsu.web.sardyko.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
	private static final String NAMESPACE_URI = "http://sardyko.web.bsu.by/models/book";

	private BookRepository bookRepository;

	@Autowired
	public BookEndpoint(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookByIdRequest")
	@ResponsePayload
	public GetBookResponse getBookById(@RequestPayload GetBookByIdRequest request) {
		GetBookResponse response = new GetBookResponse();
		response.setBook(bookRepository.findBook(request.getId()));
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookListByAuthorRequest")
	@ResponsePayload
	public GetBookListResponse getBookListByAuthor(@RequestPayload GetBookListByAuthorRequest request) {
		GetBookListResponse response = new GetBookListResponse();
		response.setBookList(bookRepository.findBookList(request.getFirstName(), request.getSecondName()));
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookListByPublisherRequest")
	@ResponsePayload
	public GetBookListResponse getBookListByPublisher(@RequestPayload GetBookListByPublisherRequest request) {
		GetBookListResponse response = new GetBookListResponse();
		response.setBookList(bookRepository.findBookList(request.getPublisher()));
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookListByYearRequest")
	@ResponsePayload
	public GetBookListResponse getBookListByPublisher(@RequestPayload GetBookListByYearRequest request) {
		GetBookListResponse response = new GetBookListResponse();
		response.setBookList(bookRepository.findBookList(request.getYear().getYear()));
		return response;
	}
}
