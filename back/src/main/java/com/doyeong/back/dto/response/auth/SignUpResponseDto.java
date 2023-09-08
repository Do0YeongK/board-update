package com.doyeong.back.dto.response.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.doyeong.back.common.response.ResponseCode;
import com.doyeong.back.common.response.ResponseMessage;
import com.doyeong.back.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignUpResponseDto extends ResponseDto {

  private SignUpResponseDto (String code, String message) {
    super(code, message);
  }

  public static ResponseEntity<SignUpResponseDto> success() {
    SignUpResponseDto result = new SignUpResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    return ResponseEntity.status(HttpStatus.OK).body(result);
  } 

  public static ResponseEntity<ResponseDto> existedEmail() {
    SignUpResponseDto result = new SignUpResponseDto(ResponseCode.EXISTED_EMAIL, ResponseMessage.EXISTED_EMAIL);
  return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(result);
  } 

 public static ResponseEntity<ResponseDto> existedNickname() {
  ResponseDto result = new ResponseDto(ResponseCode.EXISTED_NICKNAME, ResponseMessage.EXISTED_NICKNAME);
  return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(result);
 }

 public static ResponseEntity<ResponseDto> existedTelNumber() {
  ResponseDto result = new ResponseDto(ResponseCode.EXISTED_TEL_NUMBER, ResponseMessage.EXISTED_TEL_NUMBER);
  return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(result);
 }
   
}
