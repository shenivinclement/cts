import React, { Component } from 'react';
import './App.css';
import { books } from './books';
import { courses } from './courses';
import { blogs } from './blogs';

class App extends Component {
  render() {
    // Technique 1: map() with keys — Book Details
    const bookdet = (
        <ul>
          {books.map((book) => (
              <div key={book.id}>
                <h3>{book.bname}</h3>
                <h4>{book.price}</h4>
              </div>
          ))}
        </ul>
    );

    // Technique 2: element variable with if/else — Course Details
    let coursedet;
    if (courses.length > 0) {
      coursedet = (
          <ul>
            {courses.map((course) => (
                <div key={course.id}>
                  <h3>{course.name}</h3>
                  <h4>{course.date}</h4>
                </div>
            ))}
          </ul>
      );
    } else {
      coursedet = <p>No courses available.</p>;
    }

    // Technique 3: ternary + && operator — Blog Details
    const content = (
        <div>
          {blogs.length > 0 ? (
              blogs.map((blog) => (
                  <div key={blog.id}>
                    <h3>{blog.title}</h3>
                    <h4>{blog.author}</h4>
                    {blog.content && <p>{blog.content}</p>}
                  </div>
              ))
          ) : (
              <p>No blogs to show</p>
          )}
        </div>
    );

    return (
        <div>
          <div className="container">
            <div className="st2">
              <h1>Book Details</h1>
              {bookdet}
            </div>
            <div className="v1">
              <h1>Blog Details</h1>
              {content}
            </div>
            <div className="mystyle1">
              <h1>Course Details</h1>
              {coursedet}
            </div>
          </div>
        </div>
    );
  }
}

export default App;