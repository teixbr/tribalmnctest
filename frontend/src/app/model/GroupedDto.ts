import { AppleDto } from './AppleDto';
import { Crc } from './Crc';
import { TvMaze } from './TvMaze';

export interface GroupedDto {
    name: string;
    photo: string;
    itunesInfo: AppleDto;
    crcInfo: Crc;
    tvMazeInfo: TvMaze;
  }