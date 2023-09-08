import ResponseDto from "../response.dto";
import BoardListResponseDto from "./board-list.response.dto";

export default interface GetFavoriteListResponseDto extends ResponseDto {
  favoriteList: FavoriteListResponseDto[];
}

export interface FavoriteListResponseDto{
  nickname: string;
  email: string;
  profileImageUrl: string;
}