export class TvMaze {
        score: number;
        show: {
            id: number;
            url: string;
            name: string;
            type: string;
            language: string;
            genres: string[];
            status: string;
            runtime: number;
            premiered: string;
            officialSite: string;
            weight: number;
            updated: number;
            network: {
                id: number;
                name: string;
                country: {
                    name: string;
                    code: string;
                    timezone: string;
                }
            },
            summary: string;
            webChannel: string;
            schedule: {
                time: string;
                days: string[];
            },
            rating: {
                average: number;
            },
            externals: {
                tvrage: null;
                thetvdb: number;
                imdb: string;
            },
            image: {
                medium: string;
                original: string;
            },
            _links: {
                self: {
                    href: string;
                },
                previousepisode: {
                    href: string;
                },
                nextepisode: {
                    href: string;
                }
            }
        }
}