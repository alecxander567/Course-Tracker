# Course Tracker App 📈

A web application for tracking academic progress, managing courses, projects, notes, and goals throughout your educational journey. Built using React for the frontend and Spring Boot (Java) with JPA for the backend, this application provides a robust platform for students to organize and monitor their coursework and achievements.

## Features 🚀

- **Course Management:**  
  Add, update, view, and delete courses. Filter and manage courses by year level.

- **Project Tracking:**  
  Organize academic projects by year. Create, update, and delete projects, each with descriptions.

- **Notes System:**  
  Create, edit, and delete personal notes. Each note includes a title and content, and can be fetched and updated via the API.

- **Goal Setting:**  
  Define academic goals, update their status (completed/incomplete), and remove them when achieved.

- **User Profile & Streaks:**  
  Store user profiles and track engagement streaks for motivational progress.

- **RESTful API:**  
  Backend exposes endpoints for courses, projects, notes, goals, and users, enabling full CRUD operations.

## Tech Stack 🛠️

[![My Skills](https://skillicons.dev/icons?i=html,css,js,react,bootstrap,java,mysql,spring)](https://skillicons.dev)

- **Frontend:** React, Bootstrap, JavaScript, HTML, CSS
- **Backend:** Spring Boot, Java, Spring Data JPA
- **Database:** MySQL

## Getting Started 🏁

 **Backend:**
   - Navigate to the backend directory.
   - Configure your database settings in `application.properties`.
   - Build and run the Spring Boot application.
 **Frontend:**
   - Navigate to the frontend directory (e.g., `src/`).
   - Install dependencies and start the React development server.

## API Endpoints

- `/api/courses` — Manage courses
- `/api/projects` — Manage projects
- `/api/notes` — Manage notes
- `/api/goals` — Manage goals
- `/api/users` — User actions

## Example Implementation Details

- Notes, courses, and projects are tied to user profiles and can be filtered/searched by year or user.
- Streaks are updated via backend logic to motivate consistent progress.
- The frontend communicates with the backend REST API to perform all operations.
---

Made with ❤️ by [alecxander567](https://github.com/alecxander567)
