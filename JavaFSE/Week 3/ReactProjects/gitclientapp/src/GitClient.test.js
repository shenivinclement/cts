import axios from 'axios';
import GitClient from './GitClient';

jest.mock('axios');

describe('Git Client Tests', () => {

    test('should return repository names for techiesyed', () => {
        const mockedRepos = {
            data: [
                { name: 'repo1' },
                { name: 'repo2' }
            ]
        };

        axios.get.mockResolvedValue(mockedRepos);

        return GitClient.getRepositories('techiesyed').then(response => {
            expect(response.data).toEqual(mockedRepos.data);
            expect(axios.get).toHaveBeenCalledWith(
                'https://api.github.com/users/techiesyed/repos'
            );
        });
    });

});