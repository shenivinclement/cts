import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainersList';
import TrainerDetail from './TrainerDetails';
import trainersData from './TrainersMock';

function App() {
    return (
        <BrowserRouter>
            <nav>
                <Link to="/">Home</Link> | <Link to="/trainers">Trainers</Link>
            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/trainers" element={<TrainersList trainers={trainersData} />} />
                <Route path="/trainers/:id" element={<TrainerDetail />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;